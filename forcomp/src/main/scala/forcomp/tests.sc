import forcomp.Anagrams

object tests {
  Anagrams.wordOccurrences("HOlaa")

  Anagrams.sentenceOccurrences(List("Hola","como","estas"))

  Anagrams.wordOccurrences("eat")

  Anagrams.wordAnagrams("eat")

  Anagrams.combinations(List(('a', 2), ('b', 2)))

  val x = Anagrams.sentenceOccurrences(List("Linux", "rulez"))
  val y = Anagrams.sentenceOccurrences(List("Zulu"))

  Anagrams.subtract(x,y)
  Anagrams.subtract(Anagrams.subtract(Anagrams.subtract(x,y),Anagrams.sentenceOccurrences(List("nil"))),Anagrams.sentenceOccurrences(List("rex")))

  Anagrams.sentenceAnagrams(List("Zulu", "Rex", "nil"))

  Anagrams.sentenceAnagrams(List("Linux", "rulez"))

  Anagrams.sentenceAnagrams(List("rulez", "Linux"))

  Anagrams.combinations(Anagrams.sentenceOccurrences(List("Linux", "rulez"))) filter (occ => Anagrams.dictionaryByOccurrences contains occ)
}