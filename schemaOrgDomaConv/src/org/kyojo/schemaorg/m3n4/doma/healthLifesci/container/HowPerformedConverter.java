package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.HOW_PERFORMED;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.HowPerformed;

@ExternalDomain
public class HowPerformedConverter implements DomainConverter<HowPerformed, String> {

	@Override
	public String fromDomainToValue(HowPerformed domain) {
		return domain.getNativeValue();
	}

	@Override
	public HowPerformed fromValueToDomain(String value) {
		return new HOW_PERFORMED(value);
	}

}
