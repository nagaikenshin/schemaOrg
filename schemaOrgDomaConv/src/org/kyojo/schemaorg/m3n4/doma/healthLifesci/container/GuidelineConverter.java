package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.GUIDELINE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Guideline;

@ExternalDomain
public class GuidelineConverter implements DomainConverter<Guideline, String> {

	@Override
	public String fromDomainToValue(Guideline domain) {
		return domain.getNativeValue();
	}

	@Override
	public Guideline fromValueToDomain(String value) {
		return new GUIDELINE(value);
	}

}
