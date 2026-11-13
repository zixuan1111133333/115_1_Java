# 第六週AI使用紀錄

另存日期目錄AI_USAGE.md。四欄簡短填寫，不貼完整對話。使用真實AI、教師模擬回覆、教師示範與未使用AI要據實標示；未使用AI仍須填本人程式與圖的驗證。不可上傳個資、密碼或未授權資料。

| 欄位 | 本人紀錄 |
|---|---|
| 使用工具／方式 | Claude |
| 目的與提問摘要 | 完成 Mission 類別的 run、countOk、lowestEnergy 三個方法。請AI依實際方法名稱寫出完整程式 |
| 建議與本人處理 | AI第一版假設 rover.execute 回傳 MissionStep、能源 getter 叫 getEnergyAfter，與老師給的 Rover、MissionStep 不符；補貼兩個類別後AI改成 execute 回傳字串、由 Mission 用 new MissionStep(command, rover.getEnergy(), result) 建立紀錄，getter 改用 getEnergy()。 |
| 本人實際驗證 | 我實際執行的測試與結果，例如用 new Rover(10, 0) 跑腳本 {1, 1, 3, 0}，預期 getStepCount()=4、countOk()=2、countRejected()=1、lowestEnergy()=4、getOutcome()=「已返回」；實際結果：____。另外測空日誌 lowestEnergy() 是否為 -1：____ |

可在表格下附1–2張關鍵截圖，圖說包含來源、輸入、預期與實際結果。AI建議圖與本人執行圖分開標示；截圖不取代文字驗證。觀看教師操作只能記「教師示範觀察」。

## 完整填寫示例（虛構／模擬，提交前刪除）

以下是假設一名學生已做過操作的教師自編示例，不是學生或作者的真實AI對話，也不能當作本人證據。

| 欄位 | 虛構填寫 |
|---|---|
| 使用工具／方式 | 教師模擬回覆，未呼叫真實AI |
| 目的與提問摘要 | 檢查樣本盒是否能拒絕超量；人工初版已用private count與boolean store |
| 建議與本人處理 | 拒絕「直接累加就好」。在副本暫拿掉超量檢查，看到容量3仍存到4；恢復條件，最終圖補上拒絕不改值的註記 |
| 本人實際驗證 | SampleCaseDemo第二行錯誤版overflow=true,count=4；修正後overflow=false,count=2，fill到3、unload=3、empty=0。再跑兩條主任務路線；細節見我的LAB_REPORT E3 |

## 我的反思

哪一句需求幫我判斷AI建議：待填。只看類別圖還不能證明什麼：待填。
