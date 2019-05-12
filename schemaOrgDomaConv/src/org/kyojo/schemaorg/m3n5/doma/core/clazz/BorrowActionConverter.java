package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BORROW_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.BorrowAction;

@ExternalDomain
public class BorrowActionConverter implements DomainConverter<BorrowAction, String> {

	@Override
	public String fromDomainToValue(BorrowAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public BorrowAction fromValueToDomain(String value) {
		return new BORROW_ACTION(value);
	}

}
