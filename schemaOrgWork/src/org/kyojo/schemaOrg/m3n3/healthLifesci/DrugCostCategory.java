package org.kyojo.schemaorg.m3n3.healthLifesci;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/DrugCostCategory")
@CamelizedName("drugCostCategory")
@ConstantizedName("DRUG_COST_CATEGORY")
public interface DrugCostCategory extends Clazz.DrugCostCategory {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReimbursementCap")
	@SchemaOrgLabel("ReimbursementCap")
	@SchemaOrgComment(""
			+ "The drug's cost represents the maximum reimbursement paid by an insurer for the"
			+ " drug.")
	@CamelizedName("reimbursementCap")
	@ConstantizedName("REIMBURSEMENT_CAP")
	@SampleValue("1")
	public interface ReimbursementCap extends DrugCostCategory {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Retail")
	@SchemaOrgLabel("Retail")
	@SchemaOrgComment(""
			+ "The drug's cost represents the retail cost of the drug.")
	@CamelizedName("retail")
	@ConstantizedName("RETAIL")
	@SampleValue("2")
	public interface Retail extends DrugCostCategory {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Wholesale")
	@SchemaOrgLabel("Wholesale")
	@SchemaOrgComment(""
			+ "The drug's cost represents the wholesale acquisition cost of the drug.")
	@CamelizedName("wholesale")
	@ConstantizedName("WHOLESALE")
	@SampleValue("3")
	public interface Wholesale extends DrugCostCategory {

	}

}
