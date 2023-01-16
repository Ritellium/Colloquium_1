package org.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(WebServiceApp.app)
public class StringController {
    public static final String arg1str = "str1";
    public static final String arg2str = "str2";
    public static final String arg2num = "num";
    public static final String strCut = "StringCat/";
    public static final String strCutMapping = strCut + "{" + arg1str + "}/{" + arg2str + "}";
    public static final String strMul = "StringMul/";
    public static final String strMulMapping = strMul + "{" + arg1str + "}/{" + arg2num + "}";
    @RequestMapping(strCutMapping)
    public static ResponseEntity<String> concatString(@PathVariable String str1, @PathVariable String str2) {
        String result = StringEngine.concatString(str1, str2);
        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
    }
    @RequestMapping(strMulMapping)
    public static ResponseEntity<String> multiplicateString(@PathVariable String str1, @PathVariable int num) {
        String result = StringEngine.multiplicateString(str1, num);
        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
    }
}
