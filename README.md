# 📦 Tracking Number Generator API

A scalable and efficient Spring Boot REST API to generate unique tracking numbers for parcels — designed to handle high concurrency and extensibility.

---

## 🌐 Live API Endpoint

[https://tracking-api-production-bc05.up.railway.app/next-tracking-number](https://tracking-api-production-bc05.up.railway.app/next-tracking-number?origin_country_id=MY&destination_country_id=ID&weight=1.234&created_at=2025-07-22T12:00:00%2B08:00&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBox%20Logistics&customer_slug=redbox-logistics)

---

## 🔗 Example Request

```http
GET /next-tracking-number?origin_country_id=MY&destination_country_id=ID&weight=1.234&created_at=2025-07-22T12:00:00%2B08:00&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBox%20Logistics&customer_slug=redbox-logistics
```

---

## 📤 Example Response

```json
{
  "tracking_number": "A1B2C3D4E5F6G7H8",
  "created_at": "2025-07-22T12:45:30.000+05:30"
}
```

---

## ⚙️ How It Works

- Generates a 16-character uppercase alphanumeric tracking number.
- Uses origin, destination, weight, timestamp, and customer slug to derive a unique value.
- Returns a JSON response with tracking number and timestamp.
- Matches regex pattern: `^[A-Z0-9]{1,16}$`

---

## 💻 Tech Stack

- Java 21
- Spring Boot 3
- Maven
- Railway (for deployment)

---

## 🛠️ Local Setup Instructions

### ✅ Prerequisites

- Java 17 or higher (Java 21 recommended)
- Maven 3.8+
- Git

---

### 🚀 How to Run Locally

```bash
# Step 1: Clone the repository
git clone https://github.com/YOUR_USERNAME/tracking-api.git
cd tracking-api

# Step 2: Run the app
# On macOS/Linux
./mvnw spring-boot:run

# On Windows
mvnw.cmd spring-boot:run
```

The server will start at:
```
http://localhost:8080
```

---

### 🧪 Test the API Locally

```http
http://localhost:8080/next-tracking-number?origin_country_id=MY&destination_country_id=ID&weight=1.234&created_at=2025-07-22T12:00:00%2B08:00&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBox%20Logistics&customer_slug=redbox-logistics
```

Or using `curl`:

```bash
curl "http://localhost:8080/next-tracking-number?origin_country_id=MY&destination_country_id=ID&weight=1.234&created_at=2025-07-22T12:00:00%2B08:00&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBox%20Logistics&customer_slug=redbox-logistics"
```

---

## ☁️ Deployment Info

- Deployed on Railway
- Java 21 enabled via:
```
NIXPACKS_JDK_VERSION=21
```
- No build/start command needed — Railway auto-detects Spring Boot

---

## 👤 Author

Built by **Souvik**  
GitHub: [https://github.com/YOUR_USERNAME](https://github.com/YOUR_USERNAME)
