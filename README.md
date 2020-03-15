# TF Lite 練習 (2019 SCC 比賽項目)
*fork from [tensorflow](https://github.com/tensorflow/examples)*

可使用tflite 產生出來的模型做辨識的android應用程式，目前使用校狗辨識為例。

# 使用說明
將訓練產出的模型(*.tflite)和label放進assets資料夾，即可依權重做辨識產生label內含的文字。

# 關於訓練集製作的說明
因為數據量實在不多(約各50張校狗的照片)，所以使用遷移學習(tensorflow版本r1.12)製作CNN的機器學習模型，預處理使用opencv做目標的圈選。
![openCV](https://raw.githubusercontent.com/kidneyweakx/img-host/image/image/SCC-03.jpg)

# 程式說明
> 辨識部分(Python)
如上述，使用mobilenet做遷移學習，用command line做retrain，參數使用交叉驗證防止過擬和。

> Android部分
用官方提供的範例做修改，更換tflite檔案及更改介面。
* 範例圖
![example](https://raw.githubusercontent.com/kidneyweakx/img-host/image/image/SCC-05.jpg)

# 比賽狀況
[狀況心得](./README.log.md)

# 主要技術
[tensorflow](https://www.tensorflow.org/lite/guide/get_started)
[mobileNet移植](https://www.twblogs.net/a/5b8a86d82b71775d1ce7a10a)
[生成TFlite](https://www.jianshu.com/p/fa204a54a956)