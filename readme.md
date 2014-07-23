

example of post command:
curl -X POST -H "Content-Type: application/json" -d "{ \"id\": \"1\", \"description\": \"new world pillar 1\", \"urls\": [{\"url\":\"http://www.rightmove.co.uk\", \"intervalInSeconds\":\"60\"}]}" http://localhost:8070/tvconfig

output:

{
    "id": 1,
    "description": "new world pillar 1",
    "urls": [
        {
            "url": "http://www.rightmove.co.uk",
            "intervalInSeconds": 60
        }
    ]
}