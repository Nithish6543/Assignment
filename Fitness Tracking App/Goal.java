package fitness;
 class Goal extends user  {
	private static int completed_status=0;
	private static int runng; 
	private static int walk; 
	private static int swim; 
	private static int cycle; 
	public void achievements(int usid) {
		if(ar.isEmpty()||ar.get(usid).isEmpty()) {
			completed_status=0;
		}else {
		completed_status=ar.get(usid).size();
		}
		runng=running.get(usid);
		walk=walking.get(usid);
		swim=swimming.get(usid);
		cycle=cycling.get(usid);
		System.out.println("-----your achievements-----");
		System.out.println("your have completed "+completed_status+" workouts");
		System.out.println("your have Acheived "+runng+" workouts in running");
		System.out.println("your have Acheived "+walk+" workouts in walking");
		System.out.println("your have Acheived "+swim+" workouts in swimmimg");
		System.out.println("your have Acheived "+cycle+" workouts in cyclying");
	}
	public void remainder() {
		System.out.println("your have completed "+completed_status+" workouts");
		System.err.println("complete more workouts to reach your goal");
	}
}