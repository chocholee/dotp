package com.dotp.core.utils.velocity;

import org.apache.velocity.runtime.directive.Parse;

/**
 * Created by sherw on 2016/5/26.
 */
public class ExtendsDirective extends Parse {

    @Override
    public String getName() {
        return "extends";
    }

}
