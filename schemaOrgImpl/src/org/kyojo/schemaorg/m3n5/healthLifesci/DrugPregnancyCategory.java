package org.kyojo.schemaorg.m3n5.healthLifesci;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/DrugPregnancyCategory")
@CamelizedName("drugPregnancyCategory")
@ConstantizedName("DRUG_PREGNANCY_CATEGORY")
public interface DrugPregnancyCategory extends Clazz.DrugPregnancyCategory {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FDAcategoryA")
	@SchemaOrgLabel("FDAcategoryA")
	@SchemaOrgComment(""
			+ "A designation by the US FDA signifying that adequate and well-controlled studies"
			+ " have failed to demonstrate a risk to the fetus in the first trimester of"
			+ " pregnancy (and there is no evidence of risk in later trimesters).")
	@CamelizedName("fdaCategoryA")
	@ConstantizedName("FDA_CATEGORY_A")
	@SampleValue("1")
	public interface FDAcategoryA extends DrugPregnancyCategory {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FDAcategoryB")
	@SchemaOrgLabel("FDAcategoryB")
	@SchemaOrgComment(""
			+ "A designation by the US FDA signifying that animal reproduction studies have"
			+ " failed to demonstrate a risk to the fetus and there are no adequate and"
			+ " well-controlled studies in pregnant women.")
	@CamelizedName("fdaCategoryB")
	@ConstantizedName("FDA_CATEGORY_B")
	@SampleValue("2")
	public interface FDAcategoryB extends DrugPregnancyCategory {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FDAcategoryC")
	@SchemaOrgLabel("FDAcategoryC")
	@SchemaOrgComment(""
			+ "A designation by the US FDA signifying that animal reproduction studies have"
			+ " shown an adverse effect on the fetus and there are no adequate and"
			+ " well-controlled studies in humans, but potential benefits may warrant use of"
			+ " the drug in pregnant women despite potential risks.")
	@CamelizedName("fdaCategoryC")
	@ConstantizedName("FDA_CATEGORY_C")
	@SampleValue("3")
	public interface FDAcategoryC extends DrugPregnancyCategory {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FDAcategoryD")
	@SchemaOrgLabel("FDAcategoryD")
	@SchemaOrgComment(""
			+ "A designation by the US FDA signifying that there is positive evidence of human"
			+ " fetal risk based on adverse reaction data from investigational or marketing"
			+ " experience or studies in humans, but potential benefits may warrant use of the"
			+ " drug in pregnant women despite potential risks.")
	@CamelizedName("fdaCategoryD")
	@ConstantizedName("FDA_CATEGORY_D")
	@SampleValue("4")
	public interface FDAcategoryD extends DrugPregnancyCategory {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FDAcategoryX")
	@SchemaOrgLabel("FDAcategoryX")
	@SchemaOrgComment(""
			+ "A designation by the US FDA signifying that studies in animals or humans have"
			+ " demonstrated fetal abnormalities and/or there is positive evidence of human"
			+ " fetal risk based on adverse reaction data from investigational or marketing"
			+ " experience, and the risks involved in use of the drug in pregnant women clearly"
			+ " outweigh potential benefits.")
	@CamelizedName("fdaCategoryX")
	@ConstantizedName("FDA_CATEGORY_X")
	@SampleValue("5")
	public interface FDAcategoryX extends DrugPregnancyCategory {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FDAnotEvaluated")
	@SchemaOrgLabel("FDAnotEvaluated")
	@SchemaOrgComment(""
			+ "A designation that the drug in question has not been assigned a pregnancy"
			+ " category designation by the US FDA.")
	@CamelizedName("fdaNotEvaluated")
	@ConstantizedName("FDA_NOT_EVALUATED")
	@SampleValue("6")
	public interface FDAnotEvaluated extends DrugPregnancyCategory {

	}

}
