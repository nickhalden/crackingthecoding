//import facebook4j.*;
//import facebook4j.auth.AccessToken;
//import facebook4j.internal.http.RequestMethod;
//import facebook4j.internal.org.json.JSONException;
//import facebook4j.internal.org.json.JSONObject;
//
//import java.io.*;
//import java.util.*;
//
///**
// * Created by Dhruva Pendharkar on 11/6/2016.
// */
//public class Recommender {
//    public static void main(String args[]) throws IOException, FacebookException, JSONException {
//        Facebook facebook = new FacebookFactory().getInstance();
//        String appId="<appId>";
//        String appSecret = "<appSecret>";
//        facebook.setOAuthAppId(appId, appSecret);
//        String accessToken="<token>";
//        facebook.setOAuthAccessToken(new AccessToken(accessToken, null));
//
//        // Executing "me" and "me/friends?limit=50" endpoints
//        BatchRequests<BatchRequest> batch = new BatchRequests<BatchRequest>();
//        batch.add(new BatchRequest(RequestMethod.GET, "me?fields=name,location,birthday"));
//        List<BatchResponse> results = facebook.executeBatch(batch);
//
//        BatchResponse result1 = results.get(0);
//        JSONObject object = result1.asJSONObject();
//        JSONObject locationObject = (JSONObject) object.get("location");
//        String name = (String) object.get("name");
//        String birthdayString = (String) object.get("birthday");
//        String location = (String) locationObject.get("name");
//
//        int year = Integer.parseInt(birthdayString.split("/")[2]);
//        int currentYear = 2016;
//        int age = currentYear - year;
//
//        String content = "This is the content to write into file";
//
//        File file = new File("<filename>");
//
//        // if file doesnt exists, then create it
//        if (!file.exists()) {
//            file.createNewFile();
//        }
//
//        StringBuilder builder = new StringBuilder();
//        builder.append(String.format("location('%s','%s').\n", name, location));
//        builder.append(String.format("age('%s',%d).\n", name, age));
//        FileWriter fw = new FileWriter(file.getAbsoluteFile());
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write(builder.toString());
//        bw.close();
//
//
//            Process process = new ProcessBuilder("C:\\Users\\dhruv\\Desktop\\sasp-1.0.4\\sasp-1.0.4\\sasp.exe", "C:\\Users\\dhruv\\Desktop\\sasp-1.0.4\\recommend\\main.lp").start();
//        InputStream is = process.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
//        String line;
//
//        ArrayList<String> lines = new ArrayList<>();
//        while ((line = br.readLine()) != null) {
//            lines.add(line);
//        }
//
//        HashSet<String> answers = new HashSet<>();
//        for(int i=0; i<lines.size();i++) {
//            line = lines.get(i);
//            if(line.startsWith("E =")){
//                String answer = line.split("=")[1].trim();
//                answers.add(answer);
//            }
//        }
//
//        System.out.println("Dishes for " + name + ":");
//        for(String answer:answers) {
//            System.out.println(answer);
//        }
//    }
//}