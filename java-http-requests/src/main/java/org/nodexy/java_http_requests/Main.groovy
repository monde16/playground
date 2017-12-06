package org.nodexy.java_http_requests;

import com.github.kevinsawicki.http.HttpRequest
import com.google.gson.Gson;

class java_http_requests {
    static void main(String[] args) {
        def response = HttpRequest.post('http://localhost:8280/quote/premium').contentType(HttpRequest.CONTENT_TYPE_JSON).send(new Gson().toJson(premMap))
        println(response.body())
    }

    void f() {
        def response = HttpRequest.get('http://localhost:8280/health')
        println(response.body())
    }

    static def getPremMap() {
        [
                adwDecision: 'Accept',
                appId: 1234,
                appVersion: 1,
                bmi: 23,
                commissionModel: 'M1',
                commissionSacrifice: 0,
                dateOfBirth: '1988-10-03',
                disability: false,
                educationLevel: 2,
                em: 0,
                escalation: 6,
                gender: 'M',
                inceptionDate: '2017-10-09',
                lifeDecision: 'Accept',
                monthlyIncome: 123456,
                occDecision: 'Accept',
                occupation: 'Accept',
                occupationMaxCover: '350000',
                pm: 0,
                productDescription: 'ZAALALK',
                segment: 'DEFAULT',
                smoker: 'NS',
                subscriberCode: '100',
                subscriberName: 'Kalibre',
                subscriberPassword: '!Password123',
                termType: 'WL',
                coverAmount: 1_250_000,
        ]
    }
}
