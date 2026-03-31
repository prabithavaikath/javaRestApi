# 🚀 Item Management REST API

A production-ready RESTful API built with Spring Boot for managing a collection of items (e-commerce style backend). Deployed live on Railway!

## 🌐 Live Demo

**Try the API right now:** 👉 [https://javarestapi-production.up.railway.app/api/items](https://javarestapi-production.up.railway.app/api/items)

### Quick Links
- 📍 **Base URL:** https://javarestapi-production.up.railway.app
- 📦 **All Items:** https://javarestapi-production.up.railway.app/api/items
- 🔍 **Single Item:** https://javarestapi-production.up.railway.app/api/items/1


---

## ✨ Features

- ✅ **RESTful API** - Clean and intuitive endpoints
- ✅ **In-Memory Storage** - Using ArrayList for fast prototyping
- ✅ **Input Validation** - Automatic validation of required fields
- ✅ **Error Handling** - Proper HTTP status codes and error messages
- ✅ **Auto-incrementing IDs** - Unique identifiers for each item
- ✅ **Live Deployment** - Hosted on Railway for global access
- ✅ **Comprehensive Documentation** - Easy to understand and use

---

## 🛠️ Tech Stack

| Technology | Version | Purpose |
|------------|---------|---------|
| Java | 17 | Programming language |
| Spring Boot | 3.1.0 | Web framework |
| Maven | 3.6+ | Dependency management |
| Railway | - | Cloud deployment platform |

---

## 📡 API Endpoints

| Method | Endpoint | Description | Request Body | Response |
|--------|----------|-------------|--------------|----------|
| `POST` | `/api/items` | Add a new item | JSON object | Created item with ID (201) |
| `GET` | `/api/items` | Get all items | None | Array of items (200) |
| `GET` | `/api/items/{id}` | Get item by ID | None | Single item (200) or 404 |
| `GET` | `/` | API information | None | API metadata (200) |

---

## 🚀 Quick Start

### Try it in 30 seconds:

```bash
# 1. Add a new item
curl -X POST https://javarestapi-production.up.railway.app/api/items \
  -H "Content-Type: application/json" \
  -d '{"name":"Wireless Mouse","description":"Ergonomic mouse","price":25.99}'

# 2. Get all items
curl https://javarestapi-production.up.railway.app/api/items

# 3. Get a specific item
curl https://javarestapi-production.up.railway.app/api/items/1