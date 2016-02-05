// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java

package com.rethinkdb.gen.ast;

import com.rethinkdb.gen.proto.TermType;
import com.rethinkdb.gen.exc.ReqlDriverError;
import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;



public class Filter extends ReqlExpr {


    public Filter(Object arg) {
        this(new Arguments(arg), null);
    }
    public Filter(Arguments args){
        this(args, null);
    }
    public Filter(Arguments args, OptArgs optargs) {
        super(TermType.FILTER, args, optargs);
    }
public Filter optArg(String optname, Object value) {
    OptArgs newOptargs = OptArgs.fromMap(optargs).with(optname, value);
    return new Filter(args, newOptargs);
}

}