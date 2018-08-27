package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COMPUTER_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.ComputerStore;

@ExternalDomain
public class ComputerStoreConverter implements DomainConverter<ComputerStore, String> {

	@Override
	public String fromDomainToValue(ComputerStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public ComputerStore fromValueToDomain(String value) {
		return new COMPUTER_STORE(value);
	}

}