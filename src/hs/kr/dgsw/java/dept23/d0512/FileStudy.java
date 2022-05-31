package hs.kr.dgsw.java.dept23.d0512;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FileStudy {
	
	
	public void studyFileData() throws Exception {   // 이함수에 발생하는 오류를 그냥 떠넘김
		File file = new File("D:\\studyschool\\java\\sample.txt");
		File file2 = new File("D:/studyschool/java/none.txt");
		File file3 = new File("D:/studyschool/java");
		
		/* 파일의 물리적 존재 여부 */
		boolean exist = file.exists();
		System.out.println("파일의 물리적 존재 여부");
		System.out.println(file.getName() + " " + exist);
		System.out.println(file2.getName() + " " + file2.exists());
		System.out.println(file3.getName() + " " + file3.exists());
		
		System.out.println();
		
		/* 파일, 디렉토리 판단  */
		boolean bFile = file.isFile();
		boolean bDir = file.isDirectory();
		System.out.println("파일의 물리적 존재 여부");
		System.out.println(file.getName() + " " + bFile+" "+bDir);
		System.out.println(file2.getName() + " " + file2.isFile()+" "+file2.isDirectory());
		System.out.println(file3.getName() + " " + file3.isFile()+" "+file3.isDirectory());
		
		System.out.println();
		
		/* 파일의 경로 */
		File file4 = new File("D:/studyschool/java/hellow.jpg");
		String path = file4.getPath();
		String absolutePath = file4.getAbsolutePath();
		String canonicalPath = file4.getCanonicalPath();
		
		System.out.println("파일의 경로");
		System.out.println("getPath() = " + path);       			 // 상대경로
		System.out.println("absolutePath() = " + absolutePath);      // 절대경로
		System.out.println("canonicalPath() = " + canonicalPath);    // 절대경로(자동으로 정리해줌 -> 추천)
		
		System.out.println();
		
		/* 파일의 크기 */
		long size = file.length();
		
		System.out.println("파일의 크기");
		System.out.println(file.getName() + " " + size);
		System.out.println(file2.getName() + " " + file2.length());
		System.out.println(file3.getName() + " " + file3.length());
		
		System.out.println();
		
		
		/* 파일 수정 시간 */
		long time = file.lastModified();
		
		System.out.println("수정된 시각");
		//System.out.println(file.getName() + " " + time);
		System.out.println(file.getName() + " " + formatDate(convertToDate(time)));
		System.out.println();
	}
	
	public void studyManage() throws Exception {
		File file = new File("D:\\studyschool\\java\\hello.txt");
		
		/* 파일 생성 */
		boolean created = file.createNewFile();
		System.out.println("파일생성");
		System.out.println(file.getName() + " " + created);
		
		/* 파일 삭제 */
		boolean deleted = file.delete();
		System.out.println("파일삭제");
		System.out.println(file.getName() + " " + deleted);
		
		File dir = new File("D:\\studyschool\\java\\subDir");
		
		/* 디렉토리 생성 */
		created = dir.mkdir();
		System.out.println("디렉토리 생성");
		System.out.println(file.getName() + " " + created);
		
		/* 디렉토리 삭제 */
		deleted = dir.delete();
		System.out.println("디렉토리 삭제");
		System.out.println(file.getName() + " " + deleted);

		/* 만들려는 파일의 DIR이 없을 떄 */
		File dir2 = new File("D:\\studyschool\\java\\user\\image");
		created = dir2.mkdirs();
		System.out.println("디렉토리 생성");
		System.out.println(file.getName() + " " + created);

		/* 디렉토리 삭제 */
		deleted = dir2.delete();
		System.out.println("디렉토리 삭제");
		System.out.println(file.getName() + " " + deleted);
		
		/* 파일 이름 바꾸기 */
		File  original = new File("D:\\studyschool\\java\\sample.txt");
		File target = new File("D:\\studyschool\\java\\막시무스.txt");
		original.renameTo(target);
		
	}
	
	public void studyList() {
		File dir = new File("C:/");
		
		String[] list = dir.list();
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("================");
		
		File[] listFiles = dir.listFiles();
		for(File file : listFiles) {
			System.out.println(file.getAbsolutePath());
		}
	}
	
	
	public Date convertToDate(long unixTime) {
		return new Date(unixTime);
	}
	
	public String formatDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 mm월 dd일 HH시 mm분 ss초");
		return dateFormat.format(date);
	}
	
	public static void main(String[] args) throws Exception {
		FileStudy fileStudy = new FileStudy();
		//fileStudy.studyFileData();
		//fileStudy.studyManage();
		//fileStudy.studyList();
	}
}
