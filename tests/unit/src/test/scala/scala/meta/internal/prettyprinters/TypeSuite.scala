package scala.meta.internal.prettyprinters

object TypeSuite extends BaseScalaPrinterTest {
  checkType("(A, A)")
  checkType("b.B")
  checkType("A#B")
  checkType("b.type")
  checkType("this.type")
  checkType("A B C")
  checkType("A => C")
  checkType("(B => C) => A => B")
  check("def a(b: ((A, B)) => C) = b")
  checkType("(A, B) => C")
  checkType("() => C")
  checkType("implicit A => C")
  checkType("A & B")
  checkType("A | B")
  checkType("A & B | (C & D)")
  checkType("A with B")
  checkType("A { val b: B }")
  checkType("{ val b: B }")
  checkType("A[T] forSome { type T }")
  checkType("A @a")
  checkType("A[[B] => B]")
  checkType("A[_]")
  checkType("A[_ <: B]")
  check("A[({ type a[c] = d[c] })#a]")
  checkPat("a: (A => B)")
  check("def a(b: B*): B")
  check("def empty[T <: AnyRef, K[_ <: T]]: TypedMultiMap[T, K]")
  checkCase("case a: (A, B) =>")
  checkType("(A with B) @annot")
  checkType("(A => B) { def a: A }")
}
