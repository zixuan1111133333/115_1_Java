public class RoverDashboard {
    public static void main(String[] args) {
        String roverName = "赤砂號"; // 可自訂名稱
        char zone = 'A';
        int energy = 7;
        boolean locked = false;

        double batteryPercent = calculateBatteryPercent(energy);
        
        // TODO 1：以整數除法計算可完成幾次 6 格能源的探索
        int explorationCount = energy / 6; 
        
        // TODO 2：以取餘數 (%) 計算完成上述探索後剩餘能源
        int remainingEnergy = energy % 6; 
        
        // TODO 3：判斷能源是否在 0 至 20 之間（包含端點）
        boolean validEnergy = energy >= 0 && energy <= 20; 
        
        // TODO 4：判斷能源是否至少 6 格且未鎖定 (!locked)
        boolean canExplore = energy >= 6 && !locked; 

        System.out.println("探測車：" + roverName + "；區域：" + zone);
        System.out.println("能源：" + energy + "；電量百分比：" + batteryPercent);
        System.out.println("完整探索次數：" + explorationCount + "；剩餘能源：" + remainingEnergy);
        System.out.println("有效能源：" + validEnergy + "；能否探索：" + canExplore);
    }

    static double calculateBatteryPercent(int energy) {
        // TODO 5：計算電量百分比（以浮點數 20.0 除法避免整數截尾），傳回百分比
        return (energy / 20.0) * 100.0;
    }
}