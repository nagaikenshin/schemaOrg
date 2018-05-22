package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.HOW_PERFORMED;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.HowPerformed;

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
