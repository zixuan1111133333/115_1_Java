# 第五週 AI 使用紀錄

另存 AI_USAGE.md。每欄簡短填寫，不貼完整對話。使用真實服務、教師示範、模擬建議要據實標示。未使用 AI，第一欄寫「未使用」及原因，其餘可填不適用；本人課堂測試仍填 LAB_REPORT。不要上傳個資、密碼、憑證或未授權程式。

| 欄位 | 本人紀錄 |
|---|---|
| 使用工具／方式 | Gemini |
| 目的與提問摘要 | 請求實作 MissionStep 類別 (TODO 1-3) 與 MissionLog 類別 (TODO 4-6) 的程式碼，並確認物件欄位建構與歷史紀錄邏輯對齊 |
| 建議與本人處理 | 完全採納。AI 補全 MissionStep 建構子與 getter/isSuccessful，並修訂 MissionLog 中 history.add 快照新增、printReplay 回放與 printSummary 統計 |
| 本人實際驗證 | 本人於 IDE 編譯執行 MissionLog，測試腳本 {1, 1, 2} 輸出 replay 步驟 1~3、counts[0..3]=[0, 2, 1, 0]、steps=3, ok=3, rejected=0, ignored=0、lowest energy=12，最終得到 SUCCESS，測試結果符合預期 |

AI 的正確宣稱不能代替編譯執行。觀看教師展示只能記「教師示範觀察」；本人複驗才可記本人測試。

## 完整填寫範例（虛構／模擬）

以下為教師自編，假設一名學生做過這些操作，只示範填寫方式，不是你或作者的真實對話／實測證據。提交時刪除本範例，改填上表。

| 欄位 | 虛構填寫示範 |
|---|---|
| 使用工具／方式 | 教師模擬建議，未呼叫真實AI服務 |
| 目的與提問摘要 | 判讀「把電池本身存進歷史，之後再讀能源」是否保留當時狀態 |
| 建議與本人處理 | 我拒絕這項建議；兩個索引指向同一電池，不是兩個時間點的快照。在副本重現後，恢復每步建立StepCard並保存當時能源 |
| 本人實際驗證 | SnapshotDemo錯誤副本印出19/19及same object=true；恢復後兩筆command/energy為1/14、3/19，current=19、separate records=true。再跑{1,1,2}得6/5/3 SUCCESS、{3,9,0}得20/0/0 RETURNED，完整輸出放LAB_REPORT F3 |
