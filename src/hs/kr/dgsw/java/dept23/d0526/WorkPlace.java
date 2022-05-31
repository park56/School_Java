package hs.kr.dgsw.java.dept23.d0526;

public class WorkPlace {

	public void doWorking(Job job, int hours) {
		for(int i = 0; i< hours; i++) {
			job.work();
		}
		int salary = hours * job.getPrice();
		System.out.printf("급료를 %d원 받았습니다\n",salary);
	}
	
	public static void main(String[] args) {
		Job developer = new Developer();
		Job son = new Sonny();
		Job student = new Student();
		
		WorkPlace workplace = new WorkPlace();
		workplace.doWorking(student, 16);
		workplace.doWorking(son, 6);
		workplace.doWorking(developer, 8);
	}
}
