package Seminar2.Task1;

/**
 * Дана строка sql-запроса "select * from students where ". 
 * Сформируйте часть WHERE этого запроса, используя StringBuilder. 
 * Данные для фильтрации приведены ниже в виде json-строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
public class program {

    public static StringBuilder makeStr(StringBuilder builder, StringBuilder result) {
        builder.delete(0, builder.indexOf("\"")+1);
        builder.replace(builder.indexOf("\""), builder.indexOf(":")+2, "=");
        if (builder.substring(builder.indexOf("=")+1, builder.indexOf("\"")).equals("null")) {
            builder.delete(0, builder.indexOf("\"")+2);
        }
        else{
            result.append(" " + builder.substring(0, builder.indexOf("\"")));
            builder.delete(0, builder.indexOf("\"")+2);
        }
        return result;
    }
    public static void main(String[] args) {
        String json_string= "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder builder = new StringBuilder(json_string);
        StringBuilder result = new StringBuilder("select * from students where");
        while (builder.indexOf(",") != -1) {
            makeStr(builder, result);
        } 
        makeStr(builder, result);
        System.out.println(result);
    }
}