package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BORROW_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BorrowAction;

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
