package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class MessageValidator {
    // バリデーションを実行する
    public static List<String> validate(Task m) {
        List<String> errors = new ArrayList<String>();

        String title_error = validateTitle(m.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = validateContent(m.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    // 題目の必須入力チェック
    private static String validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "題目を入力してください。";
        }

        return "";
    }

    // 詳細の必須入力チェック
    private static String validateContent(String content) {
        if(content == null || content.equals("")) {
            return "詳細を入力してください。";
        }

        return "";
    }
}