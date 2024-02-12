package com.homihq.db2rest.rest.read.processor.rsql.parser;

import com.homihq.db2rest.rest.read.processor.rsql.operator.CustomRSQLOperators;

import cz.jirutka.rsql.parser.RSQLParser;

public class RSQLParserBuilder {

    public static RSQLParser newRSQLParser(){
        return new RSQLParser(CustomRSQLOperators.customOperators());
    }

}
