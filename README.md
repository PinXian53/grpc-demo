# gRPC

## 說明
RPC（Remote Procedure Call，遠端程序呼叫）是一種程式設計概念，允許程式像呼叫本地函數一樣執行遠端伺服器上的程式碼，而無需直接處理底層的網路通信細節。 <br/>
而 gRPC 是 RPC 的一個具體開源實現，由 Google 開發，基於 HTTP/2 和 Protobuf 的現代 RPC 框架。常用於現代微服務架構、雲原生應用、高性能系統。 <br/>
![landing-2.svg](img%2Flanding-2.svg) <br/>
(ref: https://grpc.io/docs/what-is-grpc/introduction/) <br/>

## 優缺點
✅ 優點
1. 高效的二進制通信：使用 Protocol Buffers（Protobuf） 作為序列化格式，比 JSON / XML 更小更快。
2. 基於 HTTP/2：支援多路復用（Multiplexing），減少連接數，提高吞吐量。
3. 支援多種語言：官方支援 C++, Java, Go, Python, Node.js 等多種語言，適合跨語言系統。
4. 內建 Streaming：支援 Client-side、Server-side、Bidirectional 串流，適用於即時應用。
5. 內建 TLS 安全性：支援 SSL/TLS 加密，提高安全性。
6. 自動生成 Stub：基於 .proto 文件，自動生成客戶端和伺服器代碼，開發效率高。

❌ 缺點
1. 學習成本高：需要學習 Protobuf 和 HTTP/2，對新手來說比 RESTful API 複雜。
2. 調試困難：二進位格式（Protobuf）不易閱讀，相比 JSON 更難直接檢查請求/回應。
3. 與瀏覽器兼容性差：瀏覽器原生不支援 gRPC，需要 gRPC-Web 代理。
4. 對於簡單應用過於複雜：如果只是簡單的 CRUD 操作，REST API 更直觀易用。
5. 生態系統相對較小：相較於 REST 和 GraphQL，gRPC 的周邊工具和社群資源較少。

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

## 測試方式
// TODO grpcurl, postman, [grpcui](https://github.com/fullstorydev/grpcui)

## 生成文件
// TODO protoc-gen-doc

## Ref
- https://grpc.io/docs/guides/
- https://grpc-ecosystem.github.io/grpc-spring/zh-CN/
