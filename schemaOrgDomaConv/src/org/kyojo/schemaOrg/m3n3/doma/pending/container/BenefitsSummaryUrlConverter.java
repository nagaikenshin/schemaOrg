package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.BENEFITS_SUMMARY_URL;
import org.kyojo.schemaOrg.m3n3.pending.Container.BenefitsSummaryUrl;

@ExternalDomain
public class BenefitsSummaryUrlConverter implements DomainConverter<BenefitsSummaryUrl, String> {

	@Override
	public String fromDomainToValue(BenefitsSummaryUrl domain) {
		return domain.getNativeValue();
	}

	@Override
	public BenefitsSummaryUrl fromValueToDomain(String value) {
		return new BENEFITS_SUMMARY_URL(value);
	}

}
