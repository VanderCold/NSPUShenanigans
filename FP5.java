import java.util.List;
import java.util.ArrayList;
class Kurs {
	static List<String> replan (List <String> plan, String newChapt, String beforeChapt);
	int newChaptIndex = plan.indexOf(beforeChapt);
	plan.add(newChaptIndex, newChapt);
	return plan;
}
class FP5 {
	public static void main(String[] args) {
		List<String> planA = new ArrayList();
		planA.add("ВВЕДЕНИЕ");
		planA.add("ГЛАВА 1");
		planA.add("Создание видеоигр");
		planA.add("ГЛАВА 2");
		List<String> planB = new ArrayList();
		planB = Kurs.replan(planA, "Анализ целевой аудитории", "ГЛАВА 2");
	}
}

class Kurs2 {
	static List<String> replan (List <String> plan, String newChapt, String beforeChapt) {
		int newChaptIndex = plan.indexOf(beforeChapt);
		List<String> replanned = new ArrayList<>(plan);
		replanned.add(newChaptIndex, newChapt);
		return replanned;
	}
}
