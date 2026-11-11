# 第四週 AI 使用紀錄

每欄簡短填寫，不必貼完整對話。沒用 AI，第一欄填「未使用」及原因，其餘免填；課堂測試仍要完成。使用模擬建議時，第一欄寫「教師模擬建議，未使用 AI 服務」，其餘依本人操作填寫。

| 欄位 | 記錄 |
|---|---|
| 使用工具 | Gemini |
| 使用目的與提問摘要 | 請AI提供MissionLog.java中TODO 1-TODO 5的程式碼實作，包含平行ArrayList的資料儲存與Collections 工具函式的應用|
| AI 建議與本人處理 | 完全採納。AI提供了清單新增、countCommands陣列邊界檢查、逐步回放輸出，以及利用 Collections.frequency與min計算摘要與最低能源 |
| 實際驗證結果 | 本人於 IDE 編譯執行 MissionLog，測試腳本 {1, 1, 2} 輸出 replay 步驟 1~3、counts[0..3]=[0, 2, 1, 0]、steps=3, ok=3, rejected=0, ignored=0、lowest energy=12，最終得到 SUCCESS，測試結果符合預期 |

只記錄實際發生的操作。AI 宣稱正確不能取代編譯執行。不要上傳個資、密碼、憑證或未授權資料。

## 完整填寫範例（虛構／模擬）

以下假設學生真的做過表列操作，用於示範填寫；不是你的執行紀錄，也不是與 AI 的真實對話。提交時刪除本範例，保留上方本人紀錄。

| 欄位 | 虛構填寫示範 |
|---|---|
| 使用工具 | 教師模擬建議，未使用 AI 服務 |
| 使用目的與提問摘要 | 檢查「指令固定 0–3，所以 counts 不需範圍檢查」；沒有向真實 AI 提問 |
| AI 建議與本人處理 | 我拒絕這個建議：日誌也記無效指令。我恢復 command >= 0 && command < counts.length，再累加 counts[command] |
| 實際驗證結果 | 副本使用 {3,9,0}，修改前在 counts[9] 越界；恢復檢查後 counts=[1,0,0,1]、steps=3、ok=0、rejected=2、ignored=0，結果 RETURNED。重測 {1,1,2} 得 6/5/3 SUCCESS；完整輸出記在 LAB_REPORT F3 |
