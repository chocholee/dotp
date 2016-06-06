package com.dotp.core.commons.velocity;

import org.apache.velocity.context.InternalContextAdapter;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.runtime.parser.node.Node;
import org.apache.velocity.runtime.parser.node.SimpleNode;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by sherw on 2016/5/26.
 */
public class OverrideNodeWrapper extends SimpleNode {

    private Node currentNode;

    private Node parentNode;

    public final static String BLOCK = "__vm_override__";

    public final static String OVERRIDE_CURRENT_NODE = "__vm_current_override_node__";

    public OverrideNodeWrapper(Node currentNode) {
        super(1);
        this.currentNode = currentNode;
    }

    public boolean render(InternalContextAdapter context, Writer writer) throws IOException {
        OverrideNodeWrapper preNode = (OverrideNodeWrapper) context.get(OVERRIDE_CURRENT_NODE);
        try {
            context.put(OVERRIDE_CURRENT_NODE, this);
            return this.currentNode.render(context, writer);
        }finally {
            context.put(OVERRIDE_CURRENT_NODE, preNode);
        }
    }

    public static String getOverrideVariableName(String name) {
        return BLOCK + name;
    }

    public static String getRequiredArgument(InternalContextAdapter context,
                                             Node node,
                                             int argumentIndex,
                                             String directive)
            throws ParseErrorException {
        SimpleNode sn_value = (SimpleNode)node.jjtGetChild(argumentIndex);
        if ( sn_value == null){
            throw new ParseErrorException("required argument is null with directive:#"+directive+"(),argumentIndex="+argumentIndex);
        }

        String value = (String)sn_value.value(context);
        if ( value == null){
            throw new ParseErrorException("required argument is null with directive:#"+directive+"(),argumentIndex="+argumentIndex);
        }
        return value;
    }

    public static void setParentForTop(OverrideNodeWrapper topParentNode,
                                       OverrideNodeWrapper node) {
        OverrideNodeWrapper top = node;
        while(top.parentNode != null) {
            top = (OverrideNodeWrapper) top.parentNode;
        }
        top.parentNode = topParentNode;
    }

    public Node getCurrentNode() {
        return currentNode;
    }

    public Node getParentNode() {
        return parentNode;
    }
}
