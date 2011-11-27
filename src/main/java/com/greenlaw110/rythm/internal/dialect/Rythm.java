package com.greenlaw110.rythm.internal.dialect;

import com.greenlaw110.rythm.internal.parser.build_in.ArgsParser;
import com.greenlaw110.rythm.internal.parser.build_in.ExpressionParser;
import com.greenlaw110.rythm.internal.parser.build_in.ImportParser;

public class Rythm extends DialectBase {

    @Override
    public String id() {
        return "rythm";
    }

    @Override
    public String a() {
        return "@";
    }

    @Override
    protected Class<?>[] buildInParserClasses() {
        return new Class<?>[] { ExpressionParser.class, ImportParser.class, ArgsParser.class };
    }

}