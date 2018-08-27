package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.LIFESTYLE_MODIFICATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.LifestyleModification;

@ExternalDomain
public class LifestyleModificationConverter implements DomainConverter<LifestyleModification, String> {

	@Override
	public String fromDomainToValue(LifestyleModification domain) {
		return domain.getNativeValue();
	}

	@Override
	public LifestyleModification fromValueToDomain(String value) {
		return new LIFESTYLE_MODIFICATION(value);
	}

}
