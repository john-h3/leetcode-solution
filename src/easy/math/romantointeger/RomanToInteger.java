package easy.math.romantointeger;

/**
 * RomanToInteger
 *
 * @author john 2021/1/5
 */
public class RomanToInteger {
  class Solution {
    short[] asciiValueTable = new short[0x7f];
    
    public Solution() {
      asciiValueTable['i'] = -1;
      asciiValueTable['I'] = 1;
      asciiValueTable['v'] = -5;
      asciiValueTable['V'] = 5;
      asciiValueTable['x'] = -10;
      asciiValueTable['X'] = 10;
      asciiValueTable['l'] = -50;
      asciiValueTable['L'] = 50;
      asciiValueTable['c'] = -100;
      asciiValueTable['C'] = 100;
      asciiValueTable['d'] = -500;
      asciiValueTable['D'] = 500;
      asciiValueTable['M'] = 1000;
    }
    
    public int romanToInt(String s) {
      int sum = 0;
      char[] romanCharArr = s.toCharArray();
      for (int i = 0; i < romanCharArr.length - 1; i++) {
        short v = asciiValueTable[romanCharArr[i]];
        short next = asciiValueTable[romanCharArr[i+1]];
        if (v < next) {
          romanCharArr[i] += 32;
        }
      }
      for (char c : romanCharArr) {
        sum += asciiValueTable[c];
      }
      return sum;
    }
  }
}
