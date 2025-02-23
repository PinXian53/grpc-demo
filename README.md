# gRPC

## 說明
RPC（Remote Procedure Call，遠端程序呼叫）是一種程式設計概念，允許程式像呼叫本地函數一樣執行遠端伺服器上的程式碼，而無需直接處理底層的網路通信細節。 <br/>
而 gRPC 是 RPC 的一個具體開源實現，由 Google 開發，基於 HTTP/2 和 Protobuf 的現代 RPC 框架。常用於現代微服務架構、雲原生應用、高性能系統。 <br/>
![landing-2.svg](img%2Flanding-2.svg) <br/>
(ref: https://grpc.io/docs/what-is-grpc/introduction/) <br/>

## 優缺點

## 常用名詞
- `Channel`: 客戶端與伺服器之間的連接，負責管理底層的網絡通信。支援多路復用，可以在同一個 Channel 上執行多個請求。 
- `Stub`: 客戶端用來調用遠端方法的代理，負責封裝請求、發送 RPC 調用，並處理回應。

## 通信方式
- `Unary RPC`: 客戶端發送單個請求，伺服器返回單個回應
  - 適合場景: 簡單的請求，ex.查詢用戶資料
- `Streaming RPC`: 流式 RPC 允許連續傳輸多個訊息，基於 HTTP/2 的多路複用實現高效通信
    - `Server-side streaming RPC`: 客戶端發送一個請求，伺服器返回一連串回應訊息
      - 適合場景: 伺服器需要推送多筆資料，ex.即時股票價格更新、聊天室訊息列表
    - `Client-side streaming RPC`: 客戶端發送一連串請求訊息，伺服器在接收完後返回單一回應
      - 適合場景: 上傳大量資料，ex.傳送日誌數據、感測器數據流
    - `Bidirectional streaming RPC`: 客戶端和伺服器同時發送和接收多個訊息，雙向獨立進行
      - 適合場景: 實時雙向通信，ex.即時聊天應用、視訊會議的音訊或控制訊號交換

## Protobuf
// TODO

## Server
// TODO

## Client
// TODO

## Ref
- https://grpc.io/docs/guides/
- https://grpc-ecosystem.github.io/grpc-spring/zh-CN/
