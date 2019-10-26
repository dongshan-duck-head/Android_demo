# TF Lite 練習 (2019 SCC 比賽項目)
*fork from [tensorflow](https://github.com/tensorflow/examples)*
> 目的動機
1. 在校園內辨識校園犬及得到新通報新的校園犬加以命名辨識。
2. 幫助使用者可以易於認識、辨認校園犬。
3. 更提供管理者一個資訊化、便利的數據統計方式。
> 簡介
* 使用相機辨識遇見的犬隻

## 紀念圖片
![測試圖像]https://raw.githubusercontent.com/kidneyweakx/img-host/image/image/SCC-01.jpg)
![比賽](https://raw.githubusercontent.com/kidneyweakx/img-host/image/image/SCC-02.jpg)

## 使用技術
![android](https://raw.githubusercontent.com/kidneyweakx/img-host/image/image/SCC-04.jpg)


![openCV](https://raw.githubusercontent.com/kidneyweakx/img-host/image/image/SCC-03.jpg)

## 程式架構

> 辨識部分(Python)

辨識部分是使用MobileNetV1，其實我也不確定好不好，主要是現在tensorflow官網IOT有描述他可以輸出的模型很小並且可以達到一定程度的訓練。其實我也使用過InceptionNet來做過，可是輸出的Model大小有點龐大，會讓App不再輕量，所以才使用MobileNet來實現。



1.首先蒐集圖片(送進去訓練的數據亮說實在其實不多)

2.然後上機訓練



訓練完成就可以了，不過說起來那麼簡單，實際操作以及蒐集圖片的過程就花費相當多的時間，而且完成企劃書和公佈進決賽名單有段空窗期，讓整個項目規劃變相當趕，整個訓練就只是將幾隻重要的狗狗輸入進去，而每隻狗的圖片量最多也才50張…

◢▆▅▄▃_崩╰(〒皿〒)╯潰_▃▄▅▆◣

直接讓整個專案難度上升好幾個檔次呢！而且檔案格式轉檔的圖片大小也大的不得了，光壓縮就快累爆了，本來是想去背去訓練整個模型，結果效果和沒去背差不多，所以就把去背這個動作取消了，不過說真的要感謝東華老師借我實驗室電腦，要不然光訓練就要跑超久



> Android部分

說來慚愧......就是修改tensorflow 的app，雖然我已經理解幾乎整個架構了，但你要我直接做出來，ㄏㄏ，還是來說說改動那些地方吧!

* 改了幾個部分

1. 讀取的tflite檔案(因為我們和tensorflow的Demo一樣使用MobileNet所以修改相當快速)

2. 介面(隱藏一些沒有必要的CPU調節部分)

還有隨便加的button，本來要做出側邊欄，和添加一些遊戲性，最後時間吃緊到直接失敗。
* 範例圖
![example](https://raw.githubusercontent.com/kidneyweakx/img-host/image/image/SCC-05.jpg)
## 比賽狀況

1. 別人的作品完整性和跨領域性都很高

2. 我們的雖然有出現作品，但功能過少，上不了臺面

## 參考資料

[tensorflow](https://www.tensorflow.org/lite/guide/get_started)
[tflite](https://codelabs.developers.google.com/codelabs/tensorflow-for-poets-2-tflite/#0)
[mobileNet移植](https://www.twblogs.net/a/5b8a86d82b71775d1ce7a10a)
[mobileNet移植教程](https://zhuanlan.zhihu.com/p/28199892)
[補充](https://allenlu2007.wordpress.com/category/machine-learning/)
[生成TFlite](https://www.jianshu.com/p/fa204a54a956)
[tensorflow_hub](http://lifo.red/2018/12/01/Tensorflow-hub%E7%AE%80%E5%8D%95%E4%BD%BF%E7%94%A8/)
[TFlite](https://www.imooc.com/article/75132?block_id=tuijian_wz)
[TFlite問題](http://www.bieryun.com/2435.html)
[TFlite問題](https://www.twblogs.net/a/5b7c9dff2b71770a43dbd601)
[TFlite問題](https://codertw.com/%E7%A8%8B%E5%BC%8F%E8%AA%9E%E8%A8%80/512752/)
[TFlite問題](https://www.imooc.com/article/75132?block_id=tuijian_wz)
[MobileNet](https://blog.csdn.net/u011974639/article/details/79199306)
[tf-convert](https://stackoverflow.com/questions/52918051/how-to-convert-pb-to-tflite-format)
[tf-convert](https://www.cnblogs.com/powercsj/p/7501055.html)
[put in demo](https://pocketflow.github.io/tutorial/#export-to-tensorflow-lite)
[democode](https://www.twblogs.net/a/5bbd4e872b71776bd30c2fee)

