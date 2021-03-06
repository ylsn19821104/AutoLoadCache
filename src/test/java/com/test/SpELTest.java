package com.test;

import com.jarvis.cache.script.IScriptParser;
import com.jarvis.cache.script.ScriptParserUtil;
import com.jarvis.cache.script.SpringELParser;

public class SpELTest {

    public static void main(String[] args) throws Exception {
        String keySpEL="test";
        Object[] arguments=new Object[]{"1111", "2222"};
        IScriptParser scriptParser=new SpringELParser();
        ScriptParserUtil scriptParserUtil=new ScriptParserUtil(scriptParser);
        String res=scriptParserUtil.getDefinedCacheKey(keySpEL, arguments, null, false);
        System.out.println(res);
        Boolean rv=scriptParserUtil.getElValue("#empty(#args)", arguments, Boolean.class);
        System.out.println(rv);
    }

}
