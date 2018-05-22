package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.RELATED_DRUG;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedDrug;

@ExternalDomain
public class RelatedDrugConverter implements DomainConverter<RelatedDrug, String> {

	@Override
	public String fromDomainToValue(RelatedDrug domain) {
		return domain.getNativeValue();
	}

	@Override
	public RelatedDrug fromValueToDomain(String value) {
		return new RELATED_DRUG(value);
	}

}
