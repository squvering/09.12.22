public class Max {
  public static int sequence(int[] arr) {
    int sum = 0, maxsum = 0; // Для отрицательных сумм ответ должен быть ноль
    for(int i=0; i < arr.length; i++) {
      sum += arr[i];
      if(sum < 0) // Если сумма стала отрицательной, то сумма будет больше, если начать со следующего элемента
        sum = 0;
      else if(sum > maxsum)
        maxsum = sum;
    }
    return maxsum;
  }
}