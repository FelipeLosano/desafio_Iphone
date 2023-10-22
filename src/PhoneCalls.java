public class PhoneCalls {
  private int number;
  private String[] voiceMessages;

  public PhoneCalls(int number, String[] voiceMessages) {
    this.number = number;
    this.voiceMessages = voiceMessages;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String[] getVoiceMessages() {
    return voiceMessages;
  }

  public void setVoiceMessages(String[] voiceMessages) {
    this.voiceMessages = voiceMessages;
  }

  public void call(int number) {
    System.out.println("Ligando para: " + number);
  }

  public void answerCall(boolean answer) {
    if (answer) {
      System.out.println("Chamada atendida");
    } else {
      System.out.println("Chamada recusada");
    }
  }

  public void voiceMail(String[] voiceMessages) {
    for (String voiceMessage : voiceMessages) {
      System.out.println("ouvindo mensagem: " + voiceMessage);
    }
  }
}
