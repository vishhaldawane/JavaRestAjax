package com.java;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//nouns vs verbs

//Resource URI

//http://localhost:8080/CurrencyConverterProject/rest/conversion/convert

@Path("/conversion")
public class CurrencyConvertService {

	public CurrencyConvertService() {
		System.out.println("CurrencyConvertService() ctor...");
	}
	
	@GET
	@Path("/myconvert")
	@Produces(MediaType.APPLICATION_JSON)
	public Currency convert() {
		
		System.out.println("convert....");
		Currency currency = new Currency();
		currency.setSourceCurrency("USD");
		currency.setTargetCurrency("INR");
		currency.setAmountToConvert(6000);
		
		return currency;
	}
}
class Currency { //POJO -plain old java object

	private String sourceCurrency;
	private String targetCurrency;
	private double amountToConvert;
	
	public String getSourceCurrency() {
		return sourceCurrency;
	}
	public void setSourceCurrency(String sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}
	public String getTargetCurrency() {
		return targetCurrency;
	}
	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}
	public double getAmountToConvert() {
		return amountToConvert;
	}
	public void setAmountToConvert(double amountToConvert) {
		this.amountToConvert = amountToConvert;
	}

	
}
