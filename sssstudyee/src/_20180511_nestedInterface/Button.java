package _20180511_nestedInterface;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Button {
	
	OnClickListener onClickListener = null;
	
	public interface OnClickListener {
		void onClick();
	}
	
	public void touch() {
		onClickListener.onClick();
	}

	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}

}
