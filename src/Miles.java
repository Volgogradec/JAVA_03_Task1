public class Miles {
    public static void main(String[] args) {
        int ticketCost = 7000;
        int bonusScale = 20;
        int bonusMile = ticketCost / bonusScale;

        System.out.println("При покупке билета стоимостью " + ticketCost + " руб., Ваш бонус составит " + bonusMile + " бонусных миль.");
    }
}
