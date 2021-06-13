/* Generated By:JJTree&JavaCC: Do not edit this line. RookieParserConstants.java */
package edu.berkeley.cs186.database.cli.parser;

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface RookieParserConstants {
  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SCOL = 5;
  /** RegularExpression Id. */
  int DOT = 6;
  /** RegularExpression Id. */
  int OPEN_PAR = 7;
  /** RegularExpression Id. */
  int CLOSE_PAR = 8;
  /** RegularExpression Id. */
  int COMMA = 9;
  /** RegularExpression Id. */
  int STAR = 10;
  /** RegularExpression Id. */
  int FSLASH = 11;
  /** RegularExpression Id. */
  int PERCENT = 12;
  /** RegularExpression Id. */
  int PLUS = 13;
  /** RegularExpression Id. */
  int MINUS = 14;
  /** RegularExpression Id. */
  int LT = 15;
  /** RegularExpression Id. */
  int LT_EQ = 16;
  /** RegularExpression Id. */
  int GT = 17;
  /** RegularExpression Id. */
  int GT_EQ = 18;
  /** RegularExpression Id. */
  int EQEQ = 19;
  /** RegularExpression Id. */
  int EQ = 20;
  /** RegularExpression Id. */
  int NOT_EQ1 = 21;
  /** RegularExpression Id. */
  int NOT_EQ2 = 22;
  /** RegularExpression Id. */
  int FALSE = 23;
  /** RegularExpression Id. */
  int TRUE = 24;
  /** RegularExpression Id. */
  int K_WITH = 25;
  /** RegularExpression Id. */
  int K_AS = 26;
  /** RegularExpression Id. */
  int K_DELETE = 27;
  /** RegularExpression Id. */
  int K_INSERT = 28;
  /** RegularExpression Id. */
  int K_INTO = 29;
  /** RegularExpression Id. */
  int K_UPDATE = 30;
  /** RegularExpression Id. */
  int K_SET = 31;
  /** RegularExpression Id. */
  int K_SELECT = 32;
  /** RegularExpression Id. */
  int K_FROM = 33;
  /** RegularExpression Id. */
  int K_INNER = 34;
  /** RegularExpression Id. */
  int K_JOIN = 35;
  /** RegularExpression Id. */
  int K_ON = 36;
  /** RegularExpression Id. */
  int K_WHERE = 37;
  /** RegularExpression Id. */
  int K_AND = 38;
  /** RegularExpression Id. */
  int K_OR = 39;
  /** RegularExpression Id. */
  int K_GROUP = 40;
  /** RegularExpression Id. */
  int K_BY = 41;
  /** RegularExpression Id. */
  int K_LIMIT = 42;
  /** RegularExpression Id. */
  int K_CREATE = 43;
  /** RegularExpression Id. */
  int K_DROP = 44;
  /** RegularExpression Id. */
  int K_TABLE = 45;
  /** RegularExpression Id. */
  int K_VALUES = 46;
  /** RegularExpression Id. */
  int K_INDEX = 47;
  /** RegularExpression Id. */
  int K_BEGIN = 48;
  /** RegularExpression Id. */
  int K_END = 49;
  /** RegularExpression Id. */
  int K_COMMIT = 50;
  /** RegularExpression Id. */
  int K_TRANSACTION = 51;
  /** RegularExpression Id. */
  int K_SAVEPOINT = 52;
  /** RegularExpression Id. */
  int K_ROLLBACK = 53;
  /** RegularExpression Id. */
  int K_TO = 54;
  /** RegularExpression Id. */
  int K_RELEASE = 55;
  /** RegularExpression Id. */
  int K_EXPLAIN = 56;
  /** RegularExpression Id. */
  int K_QUERY = 57;
  /** RegularExpression Id. */
  int K_PLAN = 58;
  /** RegularExpression Id. */
  int K_ANALYZE = 59;
  /** RegularExpression Id. */
  int K_ORDER = 60;
  /** RegularExpression Id. */
  int NUMERIC_LITERAL = 61;
  /** RegularExpression Id. */
  int DIGITS = 62;
  /** RegularExpression Id. */
  int DIGIT = 63;
  /** RegularExpression Id. */
  int SIGN = 64;
  /** RegularExpression Id. */
  int STRING_LITERAL = 65;
  /** RegularExpression Id. */
  int IDENTIFIER = 66;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\"",
    "\"\\n\"",
    "\";\"",
    "\".\"",
    "\"(\"",
    "\")\"",
    "\",\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"+\"",
    "\"-\"",
    "\"<\"",
    "\"<=\"",
    "\">\"",
    "\">=\"",
    "\"==\"",
    "\"=\"",
    "\"!=\"",
    "\"<>\"",
    "\"false\"",
    "\"true\"",
    "\"with\"",
    "\"as\"",
    "\"delete\"",
    "\"insert\"",
    "\"into\"",
    "\"update\"",
    "\"set\"",
    "\"select\"",
    "\"from\"",
    "\"inner\"",
    "\"join\"",
    "\"on\"",
    "\"where\"",
    "\"and\"",
    "\"or\"",
    "\"group\"",
    "\"by\"",
    "\"limit\"",
    "\"create\"",
    "\"drop\"",
    "\"table\"",
    "\"values\"",
    "\"index\"",
    "\"begin\"",
    "\"end\"",
    "\"commit\"",
    "\"transaction\"",
    "\"savepoint\"",
    "\"rollback\"",
    "\"to\"",
    "\"release\"",
    "\"explain\"",
    "\"query\"",
    "\"plan\"",
    "\"analyze\"",
    "\"order\"",
    "<NUMERIC_LITERAL>",
    "<DIGITS>",
    "<DIGIT>",
    "<SIGN>",
    "<STRING_LITERAL>",
    "<IDENTIFIER>",
  };

}
