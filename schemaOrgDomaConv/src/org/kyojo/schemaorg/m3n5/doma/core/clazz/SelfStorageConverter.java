package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SELF_STORAGE;
import org.kyojo.schemaorg.m3n5.core.Clazz.SelfStorage;

@ExternalDomain
public class SelfStorageConverter implements DomainConverter<SelfStorage, String> {

	@Override
	public String fromDomainToValue(SelfStorage domain) {
		return domain.getNativeValue();
	}

	@Override
	public SelfStorage fromValueToDomain(String value) {
		return new SELF_STORAGE(value);
	}

}
