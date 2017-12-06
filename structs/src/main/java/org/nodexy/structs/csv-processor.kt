package org.nodexy.structs.x

import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import java.io.FileReader

val filename = "/home/phoenix/Downloads/resources/pricing/hiv-pricing/sak-278/Cover Lead Test Cases.csv"
val map = mapOf(
		Pair("Gender", "gender"),
		Pair("Smoker", "smoker"),
		Pair("Age", "ageNextBirthday"),
		Pair("DOB", "dateOfBirth"),
		Pair("Occupation", "occupation"),
		Pair("Cover", "coverAmount"),
		Pair("EMLife", "emLife"),
		Pair("EMOCC", "emOcc"),
		Pair("EMADW", "emAdw"),
		Pair("PM", "pmLife"),
		Pair("Education Level", "educationLevel"),
		Pair("Income", "monthlyIncome"),
		Pair("Disability", "disability"),
		Pair("Life Decision", "lifeDecision"),
		Pair("Occ Decision", "occDecision"),
		Pair("Adw Decision", "adwDecision"),
		Pair("Final Decision", "finalDecision"),
		Pair("Base Risk Premium", "baseRiskPremium"),
		Pair("Loading Risk Premium", "loadingRiskPremium"),
		Pair("Decision Risk Premium", "decisionRiskPremium"),
		Pair("Base PreCommission Premium", "basePreCommissionPemium"),
		Pair("Decision PreCommission Premium", "decisionPreCommissionPremium"),
		Pair("Base Premium", "basePremium"),
		Pair("Decision Premium", "decisionPremium"),
		Pair("Final Premium", "finalPremium"),
		Pair("Premium Payable", "premiumPayable"),
		Pair("Final Cover", "coverAmount"),
		Pair("Comment", "comment")
)

fun main(args: Array<String>) {
//	println(mapContents(filename).joinToString("\n"))
	println(mapWithColumns(filename, map).first())
}

fun mapContents(filename: String): List<Map<String, String>> {
	val parser: CSVParser = CSVFormat.RFC4180.withRecordSeparator("\n").withFirstRecordAsHeader().parse(FileReader(filename))
	return parser.records.map { it-> trimMap(it.toMap()) }
}

fun trimMap(map: Map<String,String>): Map<String, String> {
	val m: MutableMap<String, String> = mutableMapOf()
	map.forEach { k, v ->
		m.put(k.trim(), v.trim())
	}
	return m
}

fun mapWithColumns(file: String, columns: Map<String, String>): List<MutableMap<String, String>> {
	return mapContents(file).map { m->
		val m2 = mutableMapOf<String,String>()
		m.forEach { k,v ->
			m2.put(columns[k] ?: k, v)
		}
		m2
	}
}
