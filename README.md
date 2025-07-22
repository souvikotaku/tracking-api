# 📦 Tracking Number Generator API

A scalable and efficient Spring Boot REST API to generate unique tracking numbers for parcels — designed to handle high concurrency and extensibility.

---

## 🌐 Live API Endpoint

[[https://tracking-api-production-bc05.up.railway.app/next-tracking-number](https://tracking-api-production-bc05.up.railway.app/next-tracking-number?origin_country_id=MY&destination_country_id=ID&weight=1.234&created_at=2025-07-22T12:00:00%2B08:00&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBox%20Logistics&customer_slug=redbox-logistics)]

---

## 🔗 Example Request

```http
GET /next-tracking-number?origin_country_id=MY&destination_country_id=ID&weight=1.234&created_at=2025-07-22T12:00:00%2B08:00&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBox%20Logistics&customer_slug=redbox-logistics
