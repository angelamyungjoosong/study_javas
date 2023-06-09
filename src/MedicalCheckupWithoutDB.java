import java.util.ArrayList;
import java.util.HashMap;

public class MedicalCheckupWithoutDB {
    public static void main(String[] args) {
        try {

            ArrayList<HashMap> MedicalList = new ArrayList<HashMap>();

            HashMap<String, String> MedicalInfo = new HashMap<String, String>();
            MedicalInfo.put("NAME", "홍길동");
            MedicalInfo.put("GENDER", "남");
            MedicalInfo.put("AGE", "30");
            MedicalInfo.put("HEIGHT", "175");
            MedicalInfo.put("WEIGHT", "75");
            MedicalInfo.put("BLOODPRESSURE", "120/80");
            MedicalInfo.put("BLOODSUGAR","90");
            MedicalInfo.put("RESULT","비정상");
            MedicalInfo.put("RECHECK", "폐암, 갑상선 질환");
            MedicalInfo.put("MAINTENANCEPLAN", " ");
            MedicalList.add(MedicalInfo);


            MedicalInfo = new HashMap<String, String>();
            MedicalInfo.put("NAME", "김영희");
            MedicalInfo.put("GENDER", "여");
            MedicalInfo.put("AGE", "25");
            MedicalInfo.put("HEIGHT", "160");
            MedicalInfo.put("WEIGHT", "55");
            MedicalInfo.put("BLOODPRESSURE", "110/70");
            MedicalInfo.put("BLOODSUGAR","85");
            MedicalInfo.put("RESULT","비정상");
            MedicalInfo.put("RECHECK", "간암, 뇌졸중");
            MedicalInfo.put("MAINTENANCEPLAN", " ");
            MedicalList.add(MedicalInfo);

            MedicalInfo = new HashMap<String, String>();
            MedicalInfo.put("NAME", "박철수");
            MedicalInfo.put("GENDER", "남");
            MedicalInfo.put("AGE", "45");
            MedicalInfo.put("HEIGHT", "180");
            MedicalInfo.put("WEIGHT", "85");
            MedicalInfo.put("BLOODPRESSURE", "130/85");
            MedicalInfo.put("BLOODSUGAR","100");
            MedicalInfo.put("RESULT","정상");
            MedicalInfo.put("RECHECK", "심장질환");
            MedicalInfo.put("MAINTENANCEPLAN", "식습관 개선, 운동계획");
            MedicalList.add(MedicalInfo);

            MedicalInfo = new HashMap<String, String>();
            MedicalInfo.put("NAME", "이지은");
            MedicalInfo.put("GENDER", "여");
            MedicalInfo.put("AGE", "35");
            MedicalInfo.put("HEIGHT", "165");
            MedicalInfo.put("WEIGHT", "60");
            MedicalInfo.put("BLOODPRESSURE", "115/75");
            MedicalInfo.put("BLOODSUGAR","95");
            MedicalInfo.put("RESULT","비정상");
            MedicalInfo.put("RECHECK", "간암, 알츠하이머병");
            MedicalInfo.put("MAINTENANCEPLAN", " ");
            MedicalList.add(MedicalInfo);

            MedicalInfo = new HashMap<String, String>();
            MedicalInfo.put("NAME", "최민호");
            MedicalInfo.put("GENDER", "남");
            MedicalInfo.put("AGE", "28");
            MedicalInfo.put("HEIGHT", "170");
            MedicalInfo.put("WEIGHT", "70");
            MedicalInfo.put("BLOODPRESSURE", "125/80");
            MedicalInfo.put("BLOODSUGAR","92");
            MedicalInfo.put("RESULT","정상");
            MedicalInfo.put("RECHECK", "간암");
            MedicalInfo.put("MAINTENANCEPLAN", " ");
            MedicalList.add(MedicalInfo);

            for(HashMap<String, String> medical:MedicalList){
                System.out.println(medical.get("NAME")+medical.get("GENDER")+medical.get("AGE")+medical.get("HEIGHT")+medical.get("WEIGHT")+medical.get("BLOODPRESSURE")+medical.get("BLOODSUGAR")+medical.get("RESULT")+medical.get("RECHECK")+medical.get("MAINTENANCEPLAN"));
            }
            
            System.out.println();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        //return 0;
    }
}
