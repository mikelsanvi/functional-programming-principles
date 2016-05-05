import objsets.{Empty, NonEmpty, Tweet}

object Tests {
  val tweetA = new Tweet("user","a",1)
  val tweetB = new Tweet("user","b",1)
  val tweetC = new Tweet("user","c",1)
  val tweetD = new Tweet("user","d",1)
  val tweetE = new Tweet("user","e",1)
  val tweetF = new Tweet("user","f",1)

  val set = new NonEmpty(tweetA,new Empty(),new Empty())

  set.filter(t => t.retweets >1)

  set.filter(t => t.retweets == 1)

  val abc = new NonEmpty(tweetA,new Empty(),new Empty()).incl(tweetB).incl(tweetC)
  val cde = new NonEmpty(tweetC,new Empty(),new Empty()).incl(tweetD).incl(tweetE)

  abc.union(cde)

  List(1,2,3)

}