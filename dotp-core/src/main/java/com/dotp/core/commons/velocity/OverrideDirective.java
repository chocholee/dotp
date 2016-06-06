package com.dotp.core.commons.velocity;

import org.apache.velocity.context.InternalContextAdapter;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.directive.Directive;
import org.apache.velocity.runtime.parser.node.Node;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by sherw on 2016/5/26.
 */
public class OverrideDirective extends Directive {

    @Override
    public String getName() {
        return "override";
    }

    @Override
    public int getType() {
        return BLOCK;
    }

    @Override
    public boolean render(InternalContextAdapter context, Writer writer, Node node) throws IOException, ResourceNotFoundException, ParseErrorException, MethodInvocationException {
        String name = OverrideNodeWrapper.getRequiredArgument(context, node, 0,getName());
        OverrideNodeWrapper override = (OverrideNodeWrapper) context.get(OverrideNodeWrapper.getOverrideVariableName(name));
        if(override == null) {
            Node body = node.jjtGetChild(1);
            context.put(OverrideNodeWrapper.getOverrideVariableName(name), new OverrideNodeWrapper(body));
        }else {
            OverrideNodeWrapper current = new OverrideNodeWrapper(node.jjtGetChild(1));
            OverrideNodeWrapper.setParentForTop(current, override);
        }
        return true;
    }

    private boolean isOverrided(InternalContextAdapter context, String name) {
        return context.get(OverrideNodeWrapper.getOverrideVariableName(name)) != null;
    }

}
