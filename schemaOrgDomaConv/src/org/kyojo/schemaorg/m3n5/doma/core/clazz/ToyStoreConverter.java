package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TOY_STORE;
import org.kyojo.schemaorg.m3n5.core.Clazz.ToyStore;

@ExternalDomain
public class ToyStoreConverter implements DomainConverter<ToyStore, String> {

	@Override
	public String fromDomainToValue(ToyStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public ToyStore fromValueToDomain(String value) {
		return new TOY_STORE(value);
	}

}
