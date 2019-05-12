package org.kyojo.schemaorg.m3n5.doma.healthLifesci.drugCostCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.drugCostCategory.REIMBURSEMENT_CAP;
import org.kyojo.schemaorg.m3n5.healthLifesci.DrugCostCategory.ReimbursementCap;

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
