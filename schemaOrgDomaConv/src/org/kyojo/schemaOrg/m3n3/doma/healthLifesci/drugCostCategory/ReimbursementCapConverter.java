package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.drugCostCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.drugCostCategory.REIMBURSEMENT_CAP;
import org.kyojo.schemaOrg.m3n3.healthLifesci.DrugCostCategory.ReimbursementCap;

@ExternalDomain
public class ReimbursementCapConverter implements DomainConverter<ReimbursementCap, String> {

	@Override
	public String fromDomainToValue(ReimbursementCap domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReimbursementCap fromValueToDomain(String value) {
		return new REIMBURSEMENT_CAP(value);
	}

}
