static int score(String word) {
	return word.replaceAll("r", "").length();
}

List<Integer> list1 = new ArrayList<>()

static Comparator<String> scoreComparator = new Comparator<String>() {
	public int compare(String w1, String w2) {
		return Integer.compare(score(w2), score(w1));
	}
}

static List<String> rankedWords(List<String> words) {
	words.sort(scoreComparator);
	return words;
}

static List<String> rankedWords2(List<String> words) {
	return words.stream().sorted(scoreComparator)collect(Collectors.toList());
}

static List<String> rankedWords3(Comparator<String> comparator, List<String> words) {
	return words.stream().sorted(scoreComparator)collect(Collectors.toList());
}

static int scoreWithBonus(String words) {
	int base = score(word);
	if (word.contains("f")) return base + 3;
	else return base;
}

static Comparator<String> score WithBonusComparator = new Comparator<String>() {
	public int compare(String w1, String w2) {
		return Integer.compare(scoreWithBonus(w2), scoreWithBonus(w1));
	}
}

Comparator<String> scoreComparator2 = (w1, w2) -> Integer.compare(score(w2), score(w1));

Function<String, Integer> score2 = w -> w.replaceAll("r", "").length();

Function<String, Integer> scoreWithBonus2 = w -> w.replaceAll("f", "fff").length();

Comparator<String> scoreComparator3 = (w1, w2) -> Integer.compare(score2.apply(w2), score2.apply(w1));

Comparator<String> scoreComparatorWithBonus2 = (w1, w2) -> Integer.compare(scoreWithBonus(w2), scoreWithBonus(w1));

Comparator<String> scoreComparatorWithBonus3 = (w1, w2) -> Integer.compare(scoreWithBonus2.apply(w2), scoreWithBonus.apply(w1));

static List<String> rankedWords4(Function<String, Integer> wordScore, List <String> words) {
	Comparator<String> wordComparator1 = (w1, w2) -> Integer.compare(wordScore.apply(w2), wordScore.apply(w1));
	return words.stream().sorted(wordComparator1).collector(Collectors.toList());