from PyQt5.QtWidgets import QApplication, QWidget
from PyQt5.QtGui import QIcon, QPalette
from PyQt5. import QMediaPlayer
import sys


#Creating window
class Window(QWidget):
    def __init__(self):
        super().__init__()

        #setting icon
        self.setWindowIcon(QIcon("Media Player.ico"))
        #setting window title
        self.setWindowTitle("Media Player")
        #setting size of window
        self.setGeometry(350, 100, 700, 500)

       



app = QApplication(sys.argv)
window = Window()
window.show()
sys.exit(app.exec_())